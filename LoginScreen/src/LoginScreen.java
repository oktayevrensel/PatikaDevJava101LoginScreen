import java.util.Scanner;

public class LoginScreen {
    public static void main(String[] args) {
        String userName,passWord,userNameDb,passWordDb;
        Scanner input= new Scanner(System.in);
        userNameDb="PatikaDev";
        passWordDb="Java101";
        System.out.print("Lüften kullanıcı adınızı giriniz:");
        userName=input.nextLine();
        System.out.print("Lüften şifrenizi giriniz:");
        passWord=input.nextLine();
        if (!userName.equals(userNameDb)&&!passWord.equals(passWordDb)){
            System.out.print("Kullanıcı Adı ve Parolanız Hatalı ");
        }
        else if (userName.equals(userNameDb)&&!passWord.equals(passWordDb)) {
            System.out.print("Şifreniz Hatalıdır.\nŞifrenizi Değiştirmek İstiyormusunuz?(E/H): ");
            String choose=input.nextLine();
            if (choose.equals("E")){
                System.out.print("Yeni Şifrenizi giriniz:");
                String newPassWord=input.nextLine();
                if (!passWord.equals(newPassWord)) {
                    passWordDb = newPassWord;
                    System.out.print("Şifreniz Başarı ile değiştirilmiştir.");
                }
                else {
                    System.out.print("Şifreniz eski şifreniz ile aynıdır.Lütfen yeni şifre belirleyin!");
                }
            }
            else {
                System.out.print("Şifreniz değiştirilmemiştir.");
            }


        } else if (passWord.equals(passWordDb)&&!userName.equals(userNameDb)) {
            System.out.print("Kullanıcı adınız hatalıdır.");
        }
        else {
            System.out.print("Başarı ile giriş yaptınız.");
        }
    }

}
