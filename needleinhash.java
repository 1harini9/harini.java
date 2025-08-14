public class NeedleInHash {
    public static void main(String[]args){
        String haystack="This is a sample haystack with a needle inside";
                String needle="needle";
                        int index=haystack.indexOf(needle);
                        if(index!=-1) {
                            System.out.println("Needle is found at index" + index);
                        }else {
                            System.out.println("Needle is not found at haystack");
                        }
    }
}
