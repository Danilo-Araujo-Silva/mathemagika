package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Hexahedron
 *
 * Full name:        System`Hexahedron
 *
 *                   Hexahedron[{p , p , …, p }] represents a filled hexahedron with corners p , p , …, p .
 *                                1   2      8                                                1   2      8
 *                   Hexahedron[{{p    , p    , …, p    }, {p    , …}, …}] represents a collection of hexahedra.
 * Usage:                          1, 1   1, 2      1, 8     2, 1
 *
 *                   VertexColors -> Automatic
 * Options:          VertexTextureCoordinates -> None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Hexahedron
 * Documentation:    web: http://reference.wolfram.com/language/ref/Hexahedron.html
 *
 * Definitions:      None
 *
 * Own values:       None
 *
 * Down values:      None
 *
 * Up values:        None
 *
 * Sub values:       None
 *
 * Default value:    None
 *
 * Numeric values:   None
 */
fun hexahedron(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Hexahedron", arguments.toMutableList(), options)
}
