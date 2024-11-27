package loginPageApp;

import java.util.*;

public class UserService {

    private List<String> mails = new ArrayList<>();
    private List<String> password = new ArrayList<>();

    //3-Ad soyad, mail, ve şifre bilgilerini alarak kayıt edicez
    public void register() {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen Ad soyad giriniz");
        String name = input.nextLine(); //kontrolleri local variable üzerinden yapıyoruz

        //-4 geçerli bir email girene kadar dönen bir döngü
        String email;
        boolean isValid;
        do {

            System.out.println("Lütfen mail adresinizi giriniz");
            email = input.nextLine(); //boşluk kontrolü yapabilmek için line ile aldık

            isValid = validateEmail(email);

            if (this.mails.contains(email)) {
                System.out.println("Bu mail halihazırda kayıtlıdır");
                isValid = false;
            }

        } while (!isValid);//geçerli değer girene kadar dönecek

        String password;
        boolean isValidPassword;

        do {

            System.out.println("şifrenizi oluşturunuz");
            password = input.nextLine();

            isValidPassword = validatePassword(password); // validatepassword metotu ödev

        } while (!isValidPassword);

        //6-User objesi oluşturup kayıt işlemini tamamlayalım

        User user = new User(name, email, password);
        this.mails.add(user.email);
        this.password.add(user.password);
        System.out.println("Tebrikler kayıt işlemi başarılıdır");
        System.out.println("Email ve şifreniz ile sisteme giriş yapabilirsiniz");

    }

    public void login() {
        Scanner input = new Scanner(System.in);
        System.out.println("Email adresinizi giriniz");
        String email = input.nextLine();

        boolean isExistEmail = this.mails.contains(email);

        if (isExistEmail) {
            //kullanıcının kaydı vardır şifreyi kontrol ederiz
            int sayaç = 3;

            while (sayaç > 0) {
                System.out.println("Şifrenizi giriniz");
                String passw = input.nextLine();
                //Şifre ile mail aynı indexte mi
                int index = this.mails.indexOf(email);
                if (this.password.get(index).equals(passw)) {
                    System.out.println("Sisteme başarılı girş yapıldı");
                    break;
                } else {
                    sayaç--;
                    System.out.println("Şifrenizi eksik yada hatalı girdiniz tekrar deneyiniz \n " +
                            "kalan deneme hakkı " + sayaç);
                }

            }

        } else {
            System.out.println("Sisteme kayıtlı kullanıcı bulunamadı");
            System.out.println("Eğer sisteme kayıtlı olduğunuzu düşünüyorsanız, bilgilerinizi kontrol ediniz");
        }
    }


    private boolean validatePassword(String password) {

       /* boşluk içermemeli
        : en az 6 karakter olmalı
        : en az bir tane küçük harf içermeli
        : en az bir tane büyük harf içermeli
        : en az bir tane rakam içermeli
        : en az bir tane sembol içermeli*/

        boolean isValidPassword;
        boolean space = password.contains(" ");
        boolean lenght = password.length() >= 6;


        if (space) {

            System.out.println("Parolanız boşluk içermemelidir");
            isValidPassword = false;
        } else if (!lenght) {

            System.out.println("Parola 6 karakterden az olamaz");
            isValidPassword = false;
        } else {

            boolean lowerCaseControl = password.replaceAll("[^a-z]", "").length() > 0;
            boolean upperCaseControl = password.replaceAll("[^A-Z]", "").length() > 0;
            boolean numberCaseControl = password.replaceAll("[^0-9]", "").length() > 0;
            boolean symbolControl = password.replaceAll("[a-zA-Z0-9\\s]", "").length() > 0;

            if (!lowerCaseControl) {
                System.out.println("Şifre en az en az bir tane küçük harf içermeli");
            }
            if (!upperCaseControl) {
                System.out.println("Şifre en az en az bir tane büyük harf içermeli");
            }
            if (!numberCaseControl) {
                System.out.println("Şifre en az en az bir tane numara içermeli");
            }
            if (!symbolControl) {
                System.out.println("Şifre en az en az bir tane sembol içermeli");
            }

            isValidPassword = lowerCaseControl && upperCaseControl && numberCaseControl && symbolControl;

            if (!isValidPassword) {
                System.out.println("geçersiz şifre");
            }
        }

        return isValidPassword;
    }


    private boolean validateEmail(String email) {
        boolean isValid;//en son return edecegim deger
        boolean space = email.contains(" ");
        boolean containsAt = email.contains("@");

        if (space) {
            System.out.println("Email boşluk karakteri iceremez!!!");
            isValid = false;
        } else if (!containsAt) {

            System.out.println("Email @ icermek zorundadır");
            isValid = false;
        } else {//alican@gmail.com
            String firstPart = email.split("@")[0];
            String secondPart = email.split("@")[1];
            //büyük-küçük harf,rakam yada -._ sembolleri dışında karakter var mı?
            int notValidCharLength = firstPart.replaceAll("[a-zA-Z0-9-._]", "").length();
            boolean checkStart = notValidCharLength == 0;//yukardakiler dısında karakter yoktur
            boolean checkEnd = secondPart.equals("gmail.com")
                    || secondPart.equals("yahoo.com")
                    || secondPart.equals("hotmail.com");
            if (!checkStart) {
                System.out.println("Email büyük-küçük harf,rakam yada -._ sembolleri dışında karakter iceremez");
            }
            if (!checkEnd) {
                System.out.println("Email gmail.com,hotmail.com veya yahoo.com ile bitmelidir");
            }
            isValid = checkStart && checkEnd;

            if (!isValid) {
                System.out.println("Geçersiz email, tekrar giriniz!!!");
            }

        }
        return isValid;

    }
    //valiadatepassword metodunu oluşturalım ODEV


    public void start() {
        Scanner input = new Scanner(System.in);
        int seçim;
        do {
            System.out.println("Kayıt için 1e, Giriş yapmak için 2'e Çıkış için 0'a basın");
             seçim = input.nextInt();
            switch (seçim) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                default:
                    System.out.println("Geçerli seçim yapılmadı");
                    break;
            }
        } while (seçim != 0);


    }

}
