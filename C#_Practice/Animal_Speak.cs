public class Animal
{
    public string Name { get; }

    public Animal(string name)
    {
        Name = name;
    }

    public virtual string Speak()
    {
        return "Animal Sound";
    }
}

public class Dog : Animal
{
    public Dog(string name) : base(name)
    {   
    }

    public override string Speak()
    {
        return "Woof";
    }
}

public class Cat : Animal
{
    public Cat(string name) : base(name)
    {   
    }

    public override string Speak()
    {
        return "Meow";
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        List<Animal> animals = new List<Animal>();

        animals.Add(new Dog("Lucky"));
        animals.Add(new Cat("Kitty"));

        foreach (Animal animal in animals)
        {
            Console.WriteLine($"Name: {animal.Name}, Sound: {animal.Speak()}");
        }
    }
}