public class operations {
    public static void main(String[] args) {
        int newElement = 9;
        int pos = 3;
        int val = 25;
        System.out.println("NewElement"+newElement);
        int[] arr = {10, 20, 30,40};
        int[] temp = new int[arr.length + 2];
        int n = arr.length;
        //insert at beginning
        temp[0] = newElement;
        for (int i = n; i <n; i++) {
            temp[i + 1] = arr[i];
        }
        n++;
        for (int i = n; i > pos; i--) {
            temp[i] = temp[i - 1];
        }
        temp[pos] = val;
        n++;
        System.out.print("Array after insertion: ");
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
                    int delarr[]={10,20,30,40};
                    int delpos=2;
                    int newArr[]=new int[delarr.length-1];
        for (int i = 0, j = 0; i < delarr.length; i++)
        {
            if (i != delpos) {
                newArr[j++] = delarr[i];
            }
        }
                        System.out.print("\nArray after deletion");
                        for(int num:newArr) {
                        System.out.print(num + " ");
                    }
            }
    }