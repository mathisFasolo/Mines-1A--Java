package TD1;

public class Main
{
    public static void main(String[] args)
    {
        try {
            InterPoint p1 = FabriquePoint.create("Point", 1, 2);
            InterPoint p2 = FabriquePoint.create("Point", 4, 6);
            InterPoint p3 = FabriquePoint.create("Point", 8, 7);
            InterPoint p4 = FabriquePoint.create("Point", 12, 4);

            /*Quadrilatere q1 = new Quadrilatere(p1, p2, p3, p4);
            Parallelogramme pl1 = new Parallelogramme(p1,p2,p3,p4);
            Losange l1 = new Losange(p1,p2,p3,p4);
            Rectangle r1 = new Rectangle(p1,p2,p3,p4);
            Carre c1 = new Carre(p1,p2,p3,p4);
            Trapeze t1 = new Trapeze(p1,p2,p3,p4);*/
            InterQuad q1 = FabriqueQuad.create("Quadrilatere",p1,p2,p3,p4);
            InterQuad pl1 = FabriqueQuad.create("Parallelogramme",p1,p2,p3,p4);
            InterQuad l1 = FabriqueQuad.create("Losange",p1,p2,p3,p4);
            InterQuad r1 = FabriqueQuad.create("Rectangle",p1,p2,p3,p4);
            InterQuad c1 = FabriqueQuad.create("Carre",p1,p2,p3,p4);
            InterQuad t1 = FabriqueQuad.create("Trapeze",p1,p2,p3,p4);
            InterQuad cv1 = FabriqueQuad.create("CerfVolant",p1,p2,p3,p4);


            System.out.println(q1.toString());
            System.out.println(pl1.toString());
            System.out.println(l1.toString());
            System.out.println(r1.toString());
            System.out.println(c1.toString());
            System.out.println(t1.toString());
            System.out.println(cv1.toString());

        }catch(Exception e) {
            e.printStackTrace();
        }


     }
}