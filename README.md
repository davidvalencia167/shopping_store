# Shopping Store - Tienda en línea (Android App)

Este proyecto consiste en el desarrollo de una aplicación móvil de una tienda en línea no funcional, realizada en Android Studio. La aplicación permite a los usuarios ver un listado de productos, añadir productos al carrito de compras, registrarse como clientes y simular el proceso de compra. **Nota**: El proyecto no incluye funcionalidades de backend o conexión con una base de datos.

## Características

- **Login de usuario**: Pantalla de inicio de sesión para los usuarios.
- **Listado de productos**: Visualización de una lista de productos con sus precios y una imagen representativa.
- **Carrito de compras**: Los usuarios pueden añadir productos al carrito y visualizar su selección.
- **Registro de clientes**: Formulario para que los usuarios nuevos puedan registrarse.
- **Geolocalización**: La aplicación obtiene la ubicación del usuario para mostrarla en el registro.
- **Funcionalidad de cámara**: Permite a los usuarios capturar imágenes desde la app.

## Tecnologías usadas

- **Lenguaje**: Kotlin
- **Entorno**: Android Studio
- **Patrón de diseño**: MVP (Model-View-Presenter)
- **Bibliotecas**:
  - [Glide](https://github.com/bumptech/glide) para cargar imágenes desde URLs.
  - [RecyclerView](https://developer.android.com/guide/topics/ui/layout/recyclerview) para mostrar listas de productos.

## Requisitos

- **Android Studio** versión 4.0 o superior.
- **SDK de Android** versión mínima 17.
- Conexión a internet para cargar imágenes de productos a través de URLs.

## Instalación

1. Clona este repositorio en tu máquina local:
    ```bash
    git clone https://github.com/tuusuario/shopping_store.git
    ```

2. Abre el proyecto en Android Studio.

3. Sincroniza el proyecto con Gradle.

4. Asegúrate de que tengas el SDK de Android configurado correctamente.

5. Ejecuta la aplicación en un emulador o en tu dispositivo Android.

## Uso

### Pantalla de Inicio

1. **Registro de Clientes**: Completa el formulario de registro para crear una cuenta.
2. **Login**: Ingresa tus credenciales para acceder o selecciona "Registro" si eres un usuario nuevo.

### Listado de Productos

- Explora los productos disponibles. Cada producto muestra su nombre, precio y una imagen.

### Carrito de Compras

- Agrega productos al carrito de compras desde el listado de productos.
- Accede al carrito para ver los productos seleccionados.
- Simula la compra (esta funcionalidad no está implementada).

### Funcionalidades adicionales

- **Geolocalización**: La aplicación obtiene la latitud y longitud del usuario al registrarse y las muestra en pantalla.
- **Uso de la cámara**: Se puede acceder a la cámara para capturar imágenes y mostrarlas en la aplicación.

## Errores conocidos

1. **Deprecación de funciones**: En algunas partes del código, se están usando métodos que han sido marcados como obsoletos, como `getSerializableExtra()`. Se recomienda actualizar el código a `getParcelableExtra()` para mejor compatibilidad.
2. **Carga de imágenes**: Asegúrate de que las URLs de las imágenes sean válidas; de lo contrario, Glide no podrá cargarlas correctamente.
3. **Validación del registro**: El formulario de registro aún no valida todos los datos ingresados, por lo que es posible ingresar información incorrecta.
4. **Emulador y cámara**: En algunos casos, la cámara no funciona en el emulador de Android Studio, pero sí en dispositivos físicos.

## Próximas mejoras

- Conectar la aplicación a una base de datos para gestionar el registro de usuarios y el carrito de compras.
- Implementar la funcionalidad de "Pago".
- Mejorar el diseño visual utilizando Material Design.

## Contribuciones

Si deseas contribuir a este proyecto, por favor realiza un fork del repositorio y abre un Pull Request. Todas las contribuciones son bienvenidas.

## Licencia

Este proyecto está bajo la licencia MIT. Para más detalles, consulta el archivo LICENSE.
