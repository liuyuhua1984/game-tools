package com.lyh.tools.entity;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class SelectOptions {
    /* access modifiers changed from: private */
    public boolean hasCam;
    /* access modifiers changed from: private */
    public boolean isCrop;
    /* access modifiers changed from: private */
    public Callback mCallback;
    /* access modifiers changed from: private */
    public int mSelectCount;
    /* access modifiers changed from: private */
    public List<String> mSelectedImages;

    public class Builder {
        private Callback callback;
        private int cropHeight;
        private int cropWidth;
        private boolean hasCam = true;
        private boolean isCrop;
        private int selectCount = 1;
        private List<String> selectedImages = new ArrayList();

        public SelectOptions build() {
            SelectOptions selectOptions = new SelectOptions();
            boolean unused = selectOptions.hasCam = this.hasCam;
            boolean unused2 = selectOptions.isCrop = this.isCrop;
            Callback unused3 = selectOptions.mCallback = this.callback;
            int unused4 = selectOptions.mSelectCount = this.selectCount;
            List unused5 = selectOptions.mSelectedImages = this.selectedImages;
            return selectOptions;
        }

        public Builder setCallback(Callback callback2) {
            this.callback = callback2;
            return this;
        }

        public Builder setCrop(int i, int i2) {
            if (i <= 0 || i2 <= 0) {
                throw new IllegalArgumentException("cropWidth or cropHeight mast be greater than 0 ");
            }
            this.isCrop = true;
            this.cropWidth = i;
            this.cropHeight = i2;
            return this;
        }

        public Builder setHasCam(boolean z) {
            this.hasCam = z;
            return this;
        }

        public Builder setSelectCount(int i) {
            if (i > 0) {
                this.selectCount = i;
                return this;
            }
            throw new IllegalArgumentException("selectCount mast be greater than 0 ");
        }

        public Builder setSelectedImages(List<String> list) {
            if (!(list == null || list.size() == 0)) {
                this.selectedImages.addAll(list);
            }
            return this;
        }

        public Builder setSelectedImages(String[] strArr) {
            if (!(strArr == null || strArr.length == 0)) {
                if (this.selectedImages == null) {
                    this.selectedImages = new ArrayList();
                }
                this.selectedImages.addAll(Arrays.asList(strArr));
            }
            return this;
        }
    }

    public interface Callback {
        void doSelected(String[] strArr) throws IOException;
    }

    public int getSelectCount() {
        return this.mSelectCount;
    }

    public List<String> getSelectedImages() {
        return this.mSelectedImages;
    }

    public boolean isCrop() {
        return this.isCrop;
    }

    public boolean isHasCam() {
        return this.hasCam;
    }
}
