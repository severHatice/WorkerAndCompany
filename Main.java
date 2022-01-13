package WorkerAndCompany;

import java.util.Scanner;

public class Main {







    static Company company = new Company();
    static Worker worker = new Worker();

    public static void main(String[] args) {


        menuGoster();
       worker.kullaniciKayit();
       company.sirketDondur(worker);
       worker.mailOlustur();
       worker.generateRandomPassword();
       System.out.println("Mail Adresiniz : " + worker.geteMail());
       System.out.println("Geçici Şifreniz : " + worker.getSifre());
       worker.objeOlustur();
       worker.mailGiris();
       worker.sifreKontrol();
        worker.yeniSifreOlustur();
     
    }

	public static void menuGoster() {
		// TODO Auto-generated method stub
		
	}

    }
