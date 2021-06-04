package com.cg.eis.pl;
import com.cg.eis.service.Service;
import java.util.*;

public class Exr2Solution {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Service emp1 = new Service();
        emp1.getempDetails();
        emp1.insuranceScheme();
        emp1.displayempDetails();

        sc1.close();
        sc2.close();

	}

}
