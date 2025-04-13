import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Arrays;
import java.util.concurrent.*;
import java.util.List;


//Thread without synchronized
class paralel implements Runnable{

    @Override
    public void run(){
for (int i=0; i< 300; i++){
    System.out.println("nilai i adalah: " + i + Thread.currentThread().getName());
}
    }
}

//Executor service + synchornized (Thread lanjutan)
class kedua{
private int hasil = 0;

synchronized void tambah(){
    hasil++;
}
int getHasil(){
    return hasil;
}
}


class pertama implements Runnable{
private kedua ka;    

pertama(){
// konstruktor kosong 
}

pertama(kedua ka){
    this.ka = ka;
}

    @Override
    public void run(){
        for (int i = 0; i<1000; i++){
            ka.tambah();
        }
    }
}


//Thread
class threadt implements Runnable{
    @Override
    public void run(){
        for (int i=0; i<10; i++){
            System.out.println("nilai i adalah: " + i + " ,dimiliki oleh thread: " + Thread.currentThread().getName());
        }
    }
}



//lambda 
interface lambda{
abstract void test();
}


// araylist
class menu{
    private String makanan;

menu(){

}

menu(String a){
this.makanan = a;
}

    String getMakan(){
        return makanan;
    }
}




interface proyek{
    abstract void ovld();
    abstract void ovld1(int a);
}


class oe implements proyek{
    @Override
    public  void ovld(){
System.out.println("ini adalah override");
    }

    // overloading
    public void ovld1(int a){
System.out.println(a + " adalah angka overloading tipe 1");
    }
    public void ovld1(String a){
        System.out.println(a + " adalah overloading tipe 2");
    }
}



class MiniTaskManager{
    //go0d0@github
    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        oe oo = new oe();
        threadt tt = new threadt();
        kedua ka = new kedua();
try{
    while(true){
        System.out.println("======= mini project: task manager =======");
        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.err.println("PIlih opsi dibawah ini.");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("1. Override");
    System.out.println("2. Overloading");
    System.out.println("3. ArrayList "); // untuk mempersingkat waktu, hanya ada create dan read :) 
    System.out.println("4. HashMap "); //untuk mempersingkat waktu, hanya ada create dan read :)
    System.out.println("5. Lambda");
    System.out.println("6. Stream api");
    System.out.println("7. Thread mannual + interface Runnable");
    System.out.println("8. Executor service");
    System.out.println("9. Executor service + Synchronized");
    System.out.println("10. Keluar");
    System.err.print(": ");
    int a = sr.nextInt();
    sr.nextLine();
    System.out.println();
    switch (a){
        //program override dari interface proyek
         case 1 -> {
oo.ovld();
         } 
         case 2 -> {    //program overloading
            System.out.print("overloading tipe 1 atau tipe 2 ?:  ");
            int c   = sr.nextInt();
            sr.nextLine();
            if(c == 1){
                System.out.print("masukkakn nilai untuk argumen (int): ");
                int x = sr.nextInt();
                sr.nextLine();
                oo.ovld1(x);
            }else if (c ==2){
                System.out.print("masukkan nilai untuk argumen (String): ");
                String y = sr.nextLine();
                oo.ovld1(y);
            }else{
                throw new Exception("Tipe tidak valid! ");
            }
         }
         //program ArrayList
         case 3 -> {
            System.out.println("sistem order/ struk pesanan direstoran");
            System.out.print("Makanan yang dipesan: ");
            String c = sr.nextLine();
            if(!c.isEmpty()){
                ArrayList<menu> al = new ArrayList<>();
                al.add(new menu(c));
              System.out.print("masukkan index untuk tampil: ");
              System.out.println();
              int q = sr.nextInt();
              sr.nextLine();
              if(q >= al.size()){
                throw new Exception("index tidak diketahui. ");
              }else{
                for (int i =0; i<al.size(); i++){
                    System.out.println(al.get(i).getMakan() + " sedang dalam proses pembuatan, mohon tunggu sebentar.");
                }
              }
            }else{
                throw new Exception("Input kosong! ");
            }

         }
         //program HashMap
         case 4 -> {
            System.out.println("sistem informasi data mahasiswa");
            HashMap<Integer, String> hp = new HashMap<>();
            System.out.print("Silahkan masukkan nim : ");
            int j = sr.nextInt();
            sr.nextLine();
            if( j>0 && j <1000000){
                System.out.print("silahkan masukkan nama: ");
                String ab = sr.nextLine();
                if (!ab.isEmpty() && ab.matches("[a-zA-Z ]+")){
                    hp.put(j, ab);
                    System.out.print("masukkan index untuk read: ");
                    int w = sr.nextInt();
                    sr.nextLine();
                    if (w >= hp.size()){
                        throw new Exception(" index tidak valid!");
                    }else{
                        for (int i = w; i<hp.size(); i++){ 
                            System.out.println("nim untuk " + j+ " adalah milik " + hp.get(j));
                        }
                    }
                }
            }else{
                throw new Exception("format nim tidak valid!");
            }
         } // program manggil interface menggunakan lambda
         case 5 -> {
            lambda la = ()-> {
                System.out.println("Print dari interface dan method abstract menggunakan lambda");
            };
            la.test();
         } // stream api 
         case 6 -> {
            List<String> al = Arrays.asList("output 1", " output 2", " output 3", " output 4" ," output 5");
            System.out.println("pilih 1 dari 2 pilihan");
            System.out.println();
            System.out.print("filter/ map ?: ");
            String w = sr.nextLine();;
            if(!w.isEmpty() && w.equalsIgnoreCase("filter")){  //kondisi untuk menggunakan filter 
                List<String> al1 = al.stream().filter(n -> n.trim().matches("output.*")).collect(Collectors.toList());
                System.out.println();
                    System.out.println(al1);
                
            }else if(!w.isEmpty() && w.equalsIgnoreCase("map")){ // kondisi untuk map 
                List<String> al1 = Arrays.asList("output 1", " output 2", " output 3", " output 4" ," output 5");
                List<String> al2 = al1.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
                System.out.println();
                System.out.println(al2);
            }else{
                throw new Exception(" error pilihan.");
            }
         }

         //thread manual + implements dari Runnable
         case 7 -> {
            Thread td = new Thread(tt);
            Thread td1 = new Thread(tt);
            Thread td2 = new Thread(tt);
            td.start();
            td1.start();
            td2.start();
            Thread.sleep(5000);
            td.interrupt();
            td1.interrupt();
            td2.interrupt();
         }

         //thread tanpa synchronized
         case 8 -> {
            System.out.print("masukkan nilai thread: ");
            int p = sr.nextInt();
            sr.nextLine();
            if(p<= 0 || p >5){
                throw new Exception(" nilai untuk thread tidak valid!");
            }else{
                
                ExecutorService ee = Executors.newFixedThreadPool(p);
                for(int i=p; i<15; i++){
                ee.execute(new paralel());
                }
                ee.shutdown();
                ee.awaitTermination(3, TimeUnit.SECONDS);
            }
            
         }

//Thread executor service + synchronized

         case 9 -> {
            System.out.print("masukkan nilai thread: ");
            int ss = sr.nextInt();
            sr.nextLine();
            if(ss <= 0 || ss >5 ){
                throw new Exception("nilai untuk thread tidak valid!");
            }else{
                ExecutorService ee = Executors.newFixedThreadPool(ss);
                for (int i=ss; i<50; i++){
                ee.execute(new pertama(ka));
                }
                ee.shutdown();
                ee.awaitTermination(5, TimeUnit.SECONDS);
                System.out.println(ka.getHasil());
            }
         }
         // program keluar 
         case 10 -> {
            System.out.println(" Sampai jumpa lagi!");
            System.exit(0);
         }

         // tindakan jika user memlikih opsi tidak valid
         default -> {
            throw new Exception (" opsi tidak valid.");
         }
    }
}       //menangkap eror
}   catch(Exception e){
    System.out.println("Terdapat kesalahan, " + e.getMessage());
}     
    }
}