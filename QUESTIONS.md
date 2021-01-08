# PARTE TEORICA

### Arquitecturas de UI: MVP, MVVM y MVI

#### MVVM

##### ¿En qué consiste esta arquitectura?
MVVM (Model-View-ViewModel) es un patrón de arquitectura cuyo principal objetivo es la separación de preocupaciones.
1.	**Las vistas (Views):**
*   Muestran la interfaz de usuario e informan sobre las acciones del usuario.
---
2.	**ViewModel:**
*	Obtiene la información de su modelo de datos
*	Aplica la operaciones necesarias y expone los datos relevantes a sus Vistas.
*	Expone eventos de backend a las vistas para que puedan reaccionar en consecuencia.
---
3.	**Model:**
*	El modelo, también conocido como DataModel, recupera información de su backend y lo pone a disposición de sus ViewModels.
---
-   Principales ventajas e inconvenientes:
*	MVVM facilita la prueba unitaria de su código.
*	MVVM puede ser demasiado complejo para aplicaciones con una interfaz de usuario simple.
*	MVVM resuelve el problema del controlador de grasa proporcionando una mejor separación de preocupaciones.
*	MVVM combina las ventajas de MVP y MVC patrones de arquitectura con otras características útiles como DataBinding. Mejora la capacidad de prueba de su código al proporcionar un mayor nivel de abstracción y reducir la cantidad de código de placa de caldera en sus proyectos.
*	Agregar ViewModels, cuyo propósito principal es estar completamente separado de las Vistas, reduce el riesgo de tener demasiado código en las otras capas.


##### ¿Cuáles son sus ventajas?
Escribe tu respuesta aquí

##### ¿Qué inconvenientes tiene?
Escribe aquí tu respuesta

#### MVP

##### ¿En qué consiste esta arquitectura?
Escribe tu respuesta aquí

##### ¿Cuáles son sus ventajas?
Escribe tu respuesta aquí

##### ¿Qué inconvenientes tiene?
Escribe aquí tu respuesta

#### MVI

##### ¿En qué consiste esta arquitectura?
Escribe tu respuesta aquí

##### ¿Cuáles son sus ventajas?
Escribe tu respuesta aquí

##### ¿Qué inconvenientes tiene?
Escribe aquí tu respuesta

---

### Testing

#### ¿Qué tipo de tests se deberían incluir en cada parte de la pirámide de test? Pon ejemplos de librerías de testing para cada una de las partes. 
Escribe aquí tu respuesta

#### ¿Por qué los desarrolladores deben centrarse sobre todo en los Unido Tests?
Escribe aquí tu respuesta

---

### Inyección de dependencias

#### Explica en qué consiste y por qué nos ayuda a mejorar nuestro código.
Escribe aquí tu respuesta

#### Explica cómo se hace para aplicar inyección de dependencias de forma manual a un proyecto (sin utilizar librerías externas).
Escribe aquí tu respuesta