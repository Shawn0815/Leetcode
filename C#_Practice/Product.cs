public class Product
{
    // Property
    public string Name { get; }
    public decimal Price { get; }
    public int Stock { get; }

    // Constructor
    public Product(string name, decimal price, int stock)
    {
        Name = name;
        Price = price;
        Stock = stock;
    }

    // Method
    public decimal GetInventoryValue()
    {
        return Price * Stock;
    }
}

public class Inventory
{
    // Property
    public List<Product> Products { get; }

    // Constructor
    public Inventory (List<Product> products)
    {
        if (Products.Count == 0)
        {
            throw new Exception("Products should not be null or empty.");
        }

        Products = products;
    }

    // Method
    public Product GetMostExpensive()
    {
        Product mostExpensive = Products[0];
        
        foreach (Product product in Products)
        {
            if (product.Price > mostExpensive.Price)
            {
                mostExpensive = product;
            }
        }

        return mostExpensive;
    }

    public List<Product> GetAvailableProducts()
    {
        List<Product> availableProducts = new List<Product>();

        foreach (Product product in Products)
        {
            if (product.Stock > 0)
            {
                availableProducts.Add(product);
            }
        }

        return availableProducts;
    }

    public decimal GetInventoryValue()
    {
        decimal value = 0;

        foreach (Product product in Products)
        {
            value += product.GetInventoryValue();
        }

        return value;
    }

}

public class Program {
    // Main
    public static void Main(string[] args)
    {
        List<Product> products = new List<Product>();

        products.Add(new Product("Keyboard", 1500, 3));
        products.Add(new Product("Mouse", 800, 0));
        products.Add(new Product("Monitor", 6000, 2));
        products.Add(new Product("Cable", 300, 5));

        // Print All Products
        foreach (Product product in products)
        {
            string name = product.Name;
            decimal price = product.Price;
            int stock = product.Stock;

            Console.WriteLine($"Name: {name}, Price: {price}, Stock: {stock}");
        }

        Console.WriteLine();

        Inventory inventory = new Inventory(products);

        // 1. Get Most expensive product in inventory
        Product mostExpensiveProduct = inventory.GetMostExpensive();
        
        Console.WriteLine(
            $"Most expensive: {mostExpensiveProduct.Name}, Price: {mostExpensiveProduct.Price}");

        Console.WriteLine();

        // 2. Print all products in inventory where stock > 0
        List<Product> availableProducts = inventory.GetAvailableProducts();

        foreach (Product product in availableProducts)
        {
            Console.WriteLine($"In Stock: {product.Name}");
        }

        Console.WriteLine();

        // 3. Get Inventory Value
        decimal inventoryValue = inventory.GetInventoryValue();

        Console.WriteLine($"Total Inventory Value: {inventoryValue}");
    }
}