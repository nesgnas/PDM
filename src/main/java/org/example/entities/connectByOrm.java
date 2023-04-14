package org.example.entities;

import jakarta.persistence.*;

import java.util.List;

public class connectByOrm {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("edu.mum.cs");


    public static List<Donor> qrDonorWithoutMap(String query){
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //TypedQuery<Donor> qr = em.createQuery("select d from Donor d where d.bloodGroup = 'AB' ", Donor.class);
        TypedQuery<Donor> qr = em.createQuery(query, Donor.class);
        EntityGraph<Donor> eg = em.createEntityGraph(Donor.class);

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
        EntityGraph<BloodPacket> eg = em.createEntityGraph(BloodPacket.class);

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
        EntityGraph<Seeker> eg = em.createEntityGraph(Seeker.class);

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
        EntityGraph<Depot> eg = em.createEntityGraph(Depot.class);

        List<Depot> depots =qr.getResultList();

        em.getTransaction().commit();
        em.close();
        return depots;
    }




    public static void main(String[] args) {// use to check instruction
        // using this to check function
        //testMultiQuery();



   }
}
