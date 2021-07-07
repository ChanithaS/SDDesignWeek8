package com.company;


public class Player {
	
	private String playerName;
    private int playerAge;
    private String playerType;
    private double statistics;
	
    private static String Davd_Malan;

    private static String Tabraiz_ShamSi;

    private static String Mohomad_Nabi;

    private static String Umar_Gul;

    private static String Shane_Watson;

	public String[] players = {Davd_Malan,Tabraiz_ShamSi,Mohomad_Nabi,Umar_Gul,Shane_Watson};

    public static void main(String[] args) {


    }
	
	public player (String playerName, int playerAge, String playerType, double statistics){
        this.playerName = playerName;
        this.playerAge = playerAge;
        this.playerType = playerType;
        this.statistics = statistics;
    }
}


}
