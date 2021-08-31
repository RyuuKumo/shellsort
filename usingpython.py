def shell(lista):
    intervalo = len(lista) // 2
    while intervalo > 0:
        for p in range(intervalo):
            reducir_busqueda(lista, p, intervalo)
        
        # intervalo = intervalo // 2
        intervalo //= 2
  
        
def reducir_busqueda(lista,inicio,salto):
    for i in range(inicio + salto, len(lista), salto):
        valor = lista[i]
        posicion = i
        
        while posicion >= salto and lista[posicion - salto] > valor:
            lista[posicion] = lista[posicion - salto]
            posicion = posicion - salto
            
        lista[posicion] = valor


if __name__ == '__main__':
    lista = [5,95,32,48,65,47,95,51,32,91]
    print(f"Lista sin ordenar : {lista}")
    shell(lista)
    print(f"Lista ordenada : {lista}")