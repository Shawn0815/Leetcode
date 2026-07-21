public class Student
{
    public string Name { get; }
    public int Score { get; }

    public Student(string name, int score)
    {
        Name = name;
        Score = score;
    }

    public char GetGrade()
    {
        switch (Score)
        {
            case >= 90:
                return 'A';
            
            case >= 80:
                return 'B';
            
            case >= 70:
                return 'C';
            
            default:
                return 'D';
        }
    }

    public static void Main(string[] args)
    {
        List<Student> students = new List<Student>
        {
            new Student("Amy", 95),
            new Student("Bob", 82),
            new Student("Cindy", 65)
        };

        foreach (Student student in students)
        {
            Console.WriteLine(
                $"Name: {student.Name}, Score: {student.Score}, Grade: {student.GetGrade()}"
            );
        }
    }
}