public class power_ranger {
    // Attribute
    //Syntax= type+name+value

    String Helmet;

    String Dress;

    String Colour;

    String Power;

    String Weapon;
    // syntax of constructor = class name+ (pass the attribute)+ {this.attribute}

    power_ranger(String Helmet, String Dress, String colour, String power, String weapon) {
        this.Helmet = Helmet;
        this.Dress = Dress;
        this.Colour = colour;
        this.Power = power;
        this.Weapon = weapon;
    }

    void attack() {
        System.out.println("power ranger are saving people");
    }
        void rule() {
            System.out.println("rule the country");


        }
}