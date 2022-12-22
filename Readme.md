# Currency Converter
Este proyecto esta hecho en Java con el IDE Netbeans y consiste en hacer una petición a una API que permite convertir las divisas que están disponibles. Los parámetros que se tienen que mandar a la API son:
    * from: La divisa de origen.
    * to: La divisa a convertir
    * mount: El monto

Así mismo para obtener la petición del API se debe de enviar el apikey.

## JFrame Window_Loading
Dentro de este JFrame se genera por defecto la clase ``cargando`` y se extiende la clase ``JFrame`` que nos permite implementar la interfaz.

![Window_Loading](https://i.ibb.co/v4JHcDS/window-Loading.png "Window_Loading")

También se extiende la clase `Runnable`, el cuál permite crear un hilo de ejecución, esto para que se pueda ejecutar esta interfaz como una ventana de cargando y luego de un tiempo de espera nos muestra la ventana Window_AmountValueEntry.

Se declara una variable privada llamada tiempo de tipo Thread(hilo) y se inicializa en null. 

Luego se tiene otra clase llamada ``cargando`` y dentro tiene el método initComponents, método que es llamado por el constructor, donde se inicializan todos los componentes gráficos. También con `this.setLocationRelativeTo(null);`, se accede a las propiedades del JFrame para colocar la ventana en el centro de la pantalla y se indica que el hijo tiempo se empiece a ejecutar.

## JFrame Window_AmountValueEntry
Dentro de esta ventana se debe colocar el monto para la conversión y dar clic en aceptar. El botón cancelar nos permite salir del programa.

![Window_AmountValueEntry](https://i.ibb.co/tJDCbRk/window-Amount-Value-Entry.png "Window_AmountValueEntry")

Solo se aceptan números, si en dado caso se ingresa otros caracteres o se deja el espacio vacío y se da clic en aceptar muestra el siguiente ShowMessageDialog. 

**ShowMessageDialog**  

![Window_AmountValueEntry](https://i.ibb.co/brMhD06/show-Message-Amount-Value-Error.png "Window_AmountValueEntry")

## JFrame Window_CurrencyConverter
Dentro de esta ventana se debe seleccionar la moneda de origen y la moneda de la que se desea obtener la divisa.   
Al momento se tiene las siguientes monedas:
* MXN: Pesos Mexicanos
* CAD: Canadian Dollars
* EUR: Euros
* USD: Dolares Estadounidenses
* HKD: Hong kong dollars
* INR: Indian rubies

Pero aun se pueden agregar otras monedas y también se cuenta con un botón regresar, que permite regresar a la ventana anterior si en dado caso se ha ingresado mal el monto a convertir.

![Window_CurrencyConverter](https://i.ibb.co/zbkG2QG/window-Currency-Converter.png "Window_CurrencyConverter")

![Window_CurrencyConverter](https://i.ibb.co/3SwVDzf/window-Currency-Converter-Selected.png "Window_CurrencyConverter")

Si en dado caso no se selecciona una opción se muestra el siguiente ShowMessageDialog.

**ShowMessageDialog**  

![Window_CurrencyConverter](https://i.ibb.co/svpvw9k/show-Message-Window-Currency-Selected-Error.png "Window_CurrencyConverter")

## JFrame Window_Result

En esta venta se muestran los resultados de la conversión. También se cuenta con un botón "Hacer otra conversión" por si se desea hacer otra y por otro lado, se tiene el botón cancelar que nos permite salir del programa.

![Window_Result](https://i.ibb.co/23wBKfK/window-Result.png "Window_Result")

<!-- ## Class ApiCcurrencylayeConversor -->
