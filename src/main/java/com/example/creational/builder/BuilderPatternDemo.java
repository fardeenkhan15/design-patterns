package com.example.creational.builder;

class Product {
    private String part1;
    private String part2;

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    @Override
    public String toString() {
        return "Product [part1=" + part1 + ", part2=" + part2 + "]";
    }
}

class ProductBuilder {
    private Product product;

    public ProductBuilder() {
        product = new Product();
    }

    public ProductBuilder buildPart1(String part1) {
        product.setPart1(part1);
        return this;
    }

    public ProductBuilder buildPart2(String part2) {
        product.setPart2(part2);
        return this;
    }

    public Product build() {
        return product;
    }
}

public class BuilderPatternDemo {
    public static void main(String[] args) {
        ProductBuilder builder = new ProductBuilder();
        Product product = builder.buildPart1("Part 1").buildPart2("Part 2").build();
        System.out.println(product);
    }
}
