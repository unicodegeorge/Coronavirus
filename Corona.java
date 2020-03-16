import java.util.ArrayList;

public class Corona {
    public static void main(String[] args) {
        Stat cr = new Stat("Ceska Republika",10000000,174,0);
        Stat usa = new Stat("Spojene Staty Americke", 327200000, 2506, 51);
        Stat it = new Stat("Italie", 60480000, 17660, 1266);
        Stat ir = new Stat("Iran", 81160000, 12729, 611);
        Stat cn = new Stat("China", 1386000000, 80824, 3189);
        
        ArrayList<Stat> staty = new ArrayList<>();
        
        staty.add(cr);
        staty.add(usa);
        staty.add(it);
        staty.add(ir);
        staty.add(cn);

        System.out.println("Vypisuji statistky vsech " + staty.size() + " statu.\n///////////////////////");
        for(int i = 0; i<staty.size(); i++) {
            Stat currentStat = staty.get(i);
            System.out.println("Nzev statu : " + currentStat.vratNazevStatu()+ 
                    "\nPocet obyvatel : "+currentStat.vratPocetObyvatel()+
                    "\nProcento nakazenych z obyvatel : " + currentStat.vratProcentoNakazenych()+
                    "\nProcento umrti z nakazenych : " + currentStat.vratProcentoSmrtiNakazenych()+"\n");
            
        }
        System.out.println("///////////////////////");
    }
}
