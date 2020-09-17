package com.company.chapter10innerclasses.examples.example04vnutrennieclassyIvoshodpreobr;

public class Parcel4 {
    private class PContents implements ContentsMZ {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    protected class PDestination implements Destination {
        private String label;

        private PDestination() {
            super();
        }

        private PDestination(String whereTo) {
            label = whereTo;

        }

        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public ContentsMZ contents() {
        return new PContents();
    }
}
