class Vehicle
{
     int wheels;
    private Vehicle(int wheels)
    {
        this.wheels=wheels;
        System.out.println(wheels+"wheeler vehicle created.");

    }
    public static void main(String[] args)
    {
        Vehicle v1=new Vehicle(3);
        Vehicle v2=new Vehicle(4);
        Vehicle v3=new Vehicle(6);
    }
}