package com.main.assessment.job1;

public class WelcomePlanet {

  public static void welcomeParent(Planet planet) {
    if (planet instanceof Jupiter) {
      System.out.println("Welcome Jupiter !");
    } else if (planet instanceof Planet) {
      System.out.println("Welcome Planet");
    } else {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    WelcomePlanet welcomePlanet = new WelcomePlanet();
    Planet planet = new Jupiter();
    welcomeParent(planet);
  }

}

class Planet {
}

class Jupiter extends Planet {
}