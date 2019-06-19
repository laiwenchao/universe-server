package com.server.test;

/**
 * @Description:
 * @Author: laiwenchao02
 * @Date: 2019/4/25 下午9:26
 */
public class CloneTest2 implements Cloneable {

    private Entry[] entries;

    CloneTest2(){
        entries = new Entry[2];
    }



    @Override
    protected CloneTest2 clone() throws CloneNotSupportedException {
        return (CloneTest2) super.clone();
    }

    class Entry {

        private String entry;

        public Entry(String entry) {
            this.entry = entry;
        }

        public String getEntry() {
            return entry;
        }

        public void setEntry(String entry) {
            this.entry = entry;
        }
    }
}
