public class Employee
{
    public string Name { get; }

    public Employee(string name)
    {
        Name = name;
    }

    public virtual decimal CalculateSalary()
    {
        return 0;
    }
}

public class FullTimeEmployee : Employee
{
    public decimal MonthlySalary { get; }

    public FullTimeEmployee(
        string name,
        decimal monthlySalary
    ) : base(name)
    {
        MonthlySalary = monthlySalary;
    }

    public override decimal CalculateSalary()
    {
        return MonthlySalary;
    }
}

public class PartTimeEmployee : Employee
{
    public decimal HourlyRate { get; }
    public int HoursWorked { get; }

    public PartTimeEmployee(
        string name,
        decimal hourlyRate,
        int hoursWorked
    ) : base(name)
    {
        HourlyRate = hourlyRate;
        HoursWorked = hoursWorked;
    }

    public override decimal CalculateSalary()
    {
        return HourlyRate * HoursWorked;
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        List<Employee> employees = new List<Employee>();

        employees.Add(new FullTimeEmployee("Amy", 60000));
        employees.Add(new PartTimeEmployee("Bob", 300, 80));
        employees.Add(new FullTimeEmployee("Cindy", 75000));

        foreach (Employee employee in employees)
        {
            Console.WriteLine($"Name: {employee.Name}, Salary: {employee.CalculateSalary()}");
        }
    }
}