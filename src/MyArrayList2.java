
    public class MyArrayList2 <E> {
        private Object[] elementData;
        public Object[] getElementData() {
            return elementData;}
        public MyArrayList2(MyArrayList2<E> myArrayList) {
            this.elementData = myArrayList.getElementData();
        }
        public void setElementData(Object[] elementData) {
            this.elementData = elementData;
        }
    }
