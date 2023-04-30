# Дипломный проект, часть 1. Unit-тесты

## Включает в себя следующие тесты:
### 1. package BurgerTests:
- **BurgerTest** - тесты для void методов класса Burger:
  - _setBuns_;
  - _addIngredient_;
  - _removeIngredient_;
  - _moveIngredient_.
- **GetPriceTest** - параметризованные тесты для метода getPrice. Проверка позитивных сценариев.
- **GetReceiptTest** - проверка метода getReceipt.

### 2. package praktikum:
- **BunParameterizedPositiveTest** - параметризованные тесты для проверки вариантов создания объекта класса Bun.
- **BunTest** - тесты для методов класса Bun:
  - _getName_;
  - _getPrice_.
- **IngredientTest** - тесты для методов класса Ingredient:
  - _getPrice_;
  - _getName_;
  - _getTypeSauce_;
  - _getTypeFilling_.
- **IngredientParameterizedPositiveTest** - параметризованные тесты для проверки вариантов создания объекта класса 
Ingredient.
- **DatabaseTest** - дополнительные тесты для методов класса Database (написаны, так как для остальных тестов 
получение данных из БД замокано):
  - _availableBuns_;
  - _availableIngredients_.

_Классы BurgerTest, GetReceiptTest, BunTest и IngredientTest используют **@Mock** класса Database._

