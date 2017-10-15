# Android_OpencvBasic
Proyecto básico que integra las librerías de OPENCV 3.3.0 con Android Studio 2.3.3

# Pasos para integrar OPENCV en Android Studio

- Crear un proyecto nuevo en Android Studio
- Importar el modulo OPENCV 3.3.0 al proyecto (File->New->Import Module-> directorio donde esta opencv en mi ordinador\OpenCV330-android-sdk\sdk\java
- Abrir el menú de configuración del modulo OPENCV y de la Aplicacion modificar los parametros:
    - Properties->Compile SDK Version  (API 25: Android 7.1.1 (Nougat))
    - Properties->Build Tools Version  (26.0.1)
    - Flavors->Min SDK Version         (API 23: Android 6.0 (Marshmallow) 
    - Flavors->Target Sdk Version      (API 25: Android 7.1.1 (Nougat)
- Agregar el módulo  openCVLibrary330 a las dependencias del proyecto. (Proyect Settings->Dependecies->+->Module Dependency)   
     
     
