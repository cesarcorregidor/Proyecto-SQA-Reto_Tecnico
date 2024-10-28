#language: es

Característica: Agregar Productos Amor

  @AgregarProductosAmor
  Escenario: Seleccionar dos productos de la
  categoría amor para agregarlos al carro de compras

    Dado Que el usuario se encuentra en la pagina web
    Cuando El seleccione el apartado amor
    Y El agregue al carrito el producto uno
    Y El se dirija nuevamente al apartado amor
    Y El agregue al carrito el producto dos
    Y El ingrese al carrito
    Entonces El visualizara la tabla de productos agregados y el precio total