package yufjin.software.nju.edu.cn;

public class Shell_sort {  
    public static void shellSort(int[] data) {  
        int j = 0;  
        int temp = 0;  
        for (int increment = data.length / 2; increment > 0; increment /= 2) {  
            for (int i = increment; i < data.length; i++) {  
                temp = data[i];  
                for (j = i; j >= increment; j -= increment) {  
                    if(temp > data[j - increment]){  
                        data[j] = data[j - increment];  
                    }else{  
                        break;  
                    }  
                }   
                data[j] = temp;  
            }  
        }  
    }  
  
    public static void main(String[] args) {  
        int[] data = new int[] { 5, 2, 8, 9, 1, 3 ,4};  
  
        System.out.println("Œ¥≈≈–Ú«∞");  
        for (int i = 0; i < data.length; i++){  
            System.out.print(data[i] + " ");  
        }  
              
        shellSort(data);  
          
        System.out.println("\n≈≈–Ú∫Û");  
        for (int i = 0; i < data.length; i++)  
            System.out.print(data[i] + " ");  
    }  
  
} 