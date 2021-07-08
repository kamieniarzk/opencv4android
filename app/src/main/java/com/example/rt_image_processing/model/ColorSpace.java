package com.example.rt_image_processing.model;


import lombok.Getter;

public enum ColorSpace {
    GRAY(0), RGB(1), HSV(2);

    @Getter
    private final int value;

    ColorSpace(int value) {
        this.value = value;
    }

    public static ColorSpace of(int value) {
        for (ColorSpace colorSpace : values()) {
            if (colorSpace.value == value) {
                return colorSpace;
            }
        }
        throw new IllegalStateException("No ColorSpace with integer value " + value + " exists.");
    }
}