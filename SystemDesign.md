# Grocery System Design

## Overview
The Grocery System is a console-based Java application designed to manage members, products, inventory, and purchases for a co-op grocery store.

## Use Cases
- Add Member — creates a new member record
- Remove Member — removes an existing member
- Add Product — creates a new product
- Add Inventory — increases stock for a product
- Purchase Product — records a purchase and updates inventory
- List Members — displays all members
- List Products — displays all products

## Core Classes
- Member
- Product
- Purchase
- InventoryManager
- StoreFacade



## Package Structure
com.grocerysystem
- model
- service
- facade
- observer
- factory
- persistence
- ui

## Design Patterns
- Facade → simplifies system access
- Singleton → single instance of system
- Observer → inventory alerts
- Factory → product creation

## System Flow
User interacts with Menu → Menu calls StoreFacade → StoreFacade delegates to services → services update models



## Conceptual Class Details

### Member
- id: int
- name: String
- email: String

### Product
- id: int
- name: String
- price: double

### Purchase
- memberId: int
- productId: int
- quantity: int
- totalPrice: double

### InventoryManager
- products: List<Product>
- stock: Map<Product, Integer>

### StoreFacade
- handles all system operations



## Relationships

- A Member can make many Purchases
- A Purchase is associated with one Product
- InventoryManager manages Products and stock levels
- StoreFacade coordinates interactions between UI and system logic

## State Behavior

Product:
- In Stock
- Low Stock
- Out of Stock

Purchase:
- Created
- Completed
- Cancelled


## Design Pattern Usage

Facade Pattern:
- StoreFacade simplifies access to system operations

Singleton Pattern:
- Only one instance of StoreFacade exists

Observer Pattern:
- InventoryManager notifies when stock is low

Factory Pattern:
- ProductFactory creates different product types


## Development Plan (Agile)

Iteration 1:
- Create Member and Product classes
- Basic add/list functionality

Iteration 2:
- Add InventoryManager
- Track stock

Iteration 3:
- Implement Purchase system

Iteration 4:
- Add design patterns (Facade, Observer)

Iteration 5:
- Add persistence (save/load system data)

Iteration 6:
- Refactor and improve structure
