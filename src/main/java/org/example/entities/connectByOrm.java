package org.example.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

public class connectByOrm {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.mum.cs");


    public static List<Donor> qrDonorWithoutMap(String query){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //TypedQuery<Donor> qr = em.createQuery("select d from Donor d where d.bloodGroup = 'AB' ", Donor.class);
        TypedQuery<Donor> qr = em.createQuery(query, Donor.class);


        List<Donor> dn =qr.getResultList();

        em.getTransaction().commit();
        em.close();

        return dn;
    }

    public static List<BloodPacket> qrBPWithoutMap(String query){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();


        //TypedQuery<BloodPacket> qr = em.createQuery("select bp from BloodPacket bp where bp.packetId = 'P-1006' or 1=1 ", BloodPacket.class);
        TypedQuery<BloodPacket> qr = em.createQuery(query, BloodPacket.class);


        List<BloodPacket> bloodPackets =qr.getResultList();

        em.getTransaction().commit();
        em.close();
        return bloodPackets;
    }

    public static List<Seeker> qrSeekerWithoutMap(String query){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //TypedQuery<Seeker> qr = em.createQuery(" select s from Seeker s  ", Seeker.class);
        TypedQuery<Seeker> qr = em.createQuery(query, Seeker.class);


        List<Seeker> seekers =qr.getResultList();

        em.getTransaction().commit();
        em.close();

        return seekers;
    }

    public static List<Depot> qrDepotWithoutMap(String query){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();


        //TypedQuery<Depot> qr = em.createQuery(" select dp from Depot dp   ", Depot.class);
        TypedQuery<Depot> qr = em.createQuery(query, Depot.class);


        List<Depot> depots =qr.getResultList();

        em.getTransaction().commit();
        em.close();
        return depots;
    }

    public static void addAccount(String user,String pass, String type){
        EntityManager em = emf.createEntityManager();
        Account account = new Account(user,pass,type);
        em.getTransaction().begin();
        em.persist(account);
        System.out.println(account);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }


    public static String checkLogin(String user, String pass){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();


        TypedQuery<Account> qr = em.createQuery("select a from Account a", Account.class);

        List<Account> accounts= qr.getResultList();
        System.out.println(accounts.toString());
        for (Account account:accounts){
            if (account.getUserName().equals(user) && account.getPassWord().equals(pass)){
                em.getTransaction().commit();
                em.close();
                return account.getTypeOfAccount();
            }
        }



        em.getTransaction().commit();
        em.close();
        return "User not Found";

    }




    public static void main(String[] args) {// use to check instruction
        // using this to check function
        //testMultiQuery();
//        addAccount("user2","123123","normalAccount");
        String checkUser = "admin";
        String checkPass = "admin";
        System.out.println(checkLogin(checkUser,checkPass));

   }
}
