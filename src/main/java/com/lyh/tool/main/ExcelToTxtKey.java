package com.lyh.tool.main;



import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Calendar;
import java.util.Properties;

/**
 * 设置生成游戏key值
 *
 * @author: root
 * @create: 2018-10-08 14:53
 **/

public class ExcelToTxtKey {
    /**
     * res路径
     **/
    public static String RES = "/res/";

    public static void main(String arg[]) {

        try {
            String userPath = System.getProperty("user.dir");
            String filePath = "excel.properties";

            if (arg != null && arg.length > 0) {
                userPath = arg[0];
                filePath = arg[1];
            }


            Properties properties = GameProperties.loadGameProperties(userPath+RES+filePath);

            String excelPath = properties.getProperty("excel-path");

            Workbook workbook = readExcel(excelPath);
            for (int n = 0;n < workbook.getNumberOfSheets(); n++){
                Sheet sheet = workbook.getSheetAt(n);
                if (sheet != null){
                   int rf =  sheet.getFirstRowNum();
                   int re = sheet.getLastRowNum();
                    StringBuilder sb01 = new StringBuilder();
                    StringBuilder sb02 = new StringBuilder();
                   for (int i = rf+1; i <= re; i++){
                       Row row = sheet.getRow(i);
                       if (row == null){
                           continue;
                       }

                       for (int y = row.getFirstCellNum(); y <= row.getLastCellNum(); y++) {
                           Object s = getCellFormatValue(row.getCell(y));
                           if (s == null || s.equals("")){
                               continue;
                           }
                           if (y==row.getLastCellNum() -1){
                               sb01.append(s+"\r\n");
                               sb02.append(s+"|");
                           } else {
                               sb01.append(s+"\r\n");
                               sb02.append(s+"|");
                           }
                       }
//                       bufferedWriter.append(strb.toString());

                   }

                    WriteToFileTxt01(sb01.toString(),userPath+File.separator+"android.txt");
                    WriteToFileTxt01(sb02.toString(),userPath+File.separator+"ios.txt");
                }
            }


            System.err.println("已完成");
        }catch (Exception e){
            e.printStackTrace();
            System.exit(0);
        }
    }


    // 读取excel
    public static Workbook readExcel(String filePath) {
        Workbook wb = null;
        if (filePath == null) {
            return null;
        }
        String extString = filePath.substring(filePath.lastIndexOf("."));
        InputStream is = null;
        try {
            is = new FileInputStream(filePath);
            if (".xls".equals(extString)) {
                return wb = new HSSFWorkbook(is);
            } else if (".xlsx".equals(extString)) {
                return wb = new XSSFWorkbook(is);
            } else {
                return wb = null;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if ( is != null){
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return wb;
    }

    public static Object getCellFormatValue(Cell cell) {
        Object cellValue = null;
        if (cell != null) {
            if (cell.getCellType() == CellType.NUMERIC){
                cellValue = String.valueOf(cell.getNumericCellValue());
            }else if (cell.getCellType() == CellType.FORMULA){
                // 判断cell是否为日期格式
                if (DateUtil.isCellDateFormatted(cell)) {
                    // 转换为日期格式YYYY-mm-dd
                    cellValue = cell.getDateCellValue();
                } else {
                    // 数字
                    cellValue = String.valueOf(cell.getNumericCellValue());
                }
            }else if (cell.getCellType() == CellType.STRING){
                cellValue = cell.getRichStringCellValue().getString();
            }else{
                cellValue = "";
            }

        } else {
            cellValue = "";
        }
        return cellValue;
    }

    /**
     * 生成文件
     * @param str
     * @param filePath
     * @throws IOException
     */

    public static void WriteToFileTxt01(String str, String filePath) throws IOException {
        BufferedWriter bw = null;
        try {
            FileOutputStream out = new FileOutputStream(filePath, false);// true,表示:文件追加内容，不重新生成,默认为false
            bw = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
            bw.write(str);// 换行
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.close();
        }
    }

    public static void WriteToFileTxt02(String str, String filePath) throws IOException {
        BufferedWriter bw = null;
        try {
            FileOutputStream out = new FileOutputStream(filePath, false);// true,表示:文件追加内容，不重新生成,默认为false
            bw = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
            bw.write(str);// 换行
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            bw.close();
        }
    }

}
