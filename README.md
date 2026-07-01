####
<h2>Java-Geometry</h2>

<p>Проект разработан исключительно в учебных целях</p>

<p>список команд для подсчёта площади и перемитра разных фигур</p>

2D
----
Круг: `mvn com.example:geometry.shapes:circle -Dr=4`, <br />
где `-Dr=4` - радиус круга

Прямоугольник: `mvn com.example:geometry.shapes:rectangle -Dh=4 -Dw=8`, <br />
где `-Dh=4` - высота прямоугольника<br />
`-Dw=8` - ширина треугольника

Треугольник: `mvn com.example:geometry.shapes:triangle -Da=4 -Db=3 -Dc=2`, <br />
где `-Da=4` - сторона A треугольника,<br />
`-Db=4` - сторона B треугольника,<br />
`-Dc=4` - сторона C треугольника,<br />
а так же треугольник может быть расчитан имея только высоту и сторону A, тогда команда будет иметь вид:
`mvn com.example:geometry.shapes:triangle -Da=4 -Dh=8`, <br />
где `-Da=4` - сторона A треугольника,<br />
`-Dh=8` - высота треугольника

3D
---
Шар или Сфера: `mvn com.example:geometry.shapes:sphere -Dr=8`<br />
где `-Dr=4` - радиус сферы

Параллепипед: `mvn com.example:geometry.shapes:parallelepiped -Dl=7 -Dw=8 -Dh=9`, <br />
где `-Dl=7` - длина <br />
`-Dw=8` - ширина <br />
`-Dh=9` - высота 

Правильный тетраэдр: `mvn com.example:geometry.shapes:tetrahedron -Da=8`, <br />
где `-Da=8` - грань тетраэдра.<br />
У правильного тетраэдра все грани ровны.


