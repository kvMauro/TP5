### UNIVERSIDAD TECNOLÓGICA NACIONAL FACULTAD REGIONAL GENERAL PACHECO

#### Tecnicatura Universitaria en Programación

#### Laboratorio de computación IV

# TP 5 - Ejercicios de aplicaciones de escritorio

1. <b>IMPORTANTE:</b> PARA APROBAR EL TP CREAR EL CORRECTO DIAGRAMA DE 
CLASES PARA LA APLICACIÓN. Es decir, debe haber una clase películas y una 
clase generos. La clase películas debe tener un objeto de tipo generos en su 
interior… NO UN STRING LLAMADO “GENEROS”.
2. <b>IMPORTANTE:</b> Debe haber una clase Principal que contenga el main y SOLO 
DEBE HABER UN MAIN EN EL PROYECTO.
3. El proyecto cuenta con un menú para agregar y listar películas.

![Captura](https://github.com/user-attachments/assets/fa550b22-c0bc-4252-8a95-14b2e99170c9)

### Agregar pelicula
![Captura2](https://github.com/user-attachments/assets/78a5f1eb-ca25-46f5-a15f-98c1d9450e13)

A. El ID de las películas se irá generando y mostrando automáticamente. La 
primera película tiene ID=1 y se irá incrementando de a una unidad por vez, 
cada vez que se agregue una película.

B. El ComboBox géneros se llenará con la siguiente lista de elementos:
<ul>
  <li>Seleccione un género</li>
  <li>Terror</li>
  <li>Acción</li>
  <li>Suspenso</li>
  <li>Romántica</li>
</ul>

C. El botón aceptar guardará las películas creadas solo si cumplen con las
siguientes condiciones: se haya escrito algo sobre el TextField destinado para
el nombre de las películas y se haya seleccionado algo diferente a “seleccione 
un género” en el ComboBox. En caso de que no se pueda agregar la película, 
informar con un cartel aclaratorio (Se puede utilizar un JOptionPane).

### Listar peliculas

D. Se mostrarán las películas ordenadas por nombre de película desde la A a la Z.
![Captura3](https://github.com/user-attachments/assets/2611b581-53ad-4956-ba64-5876727a75b7)
