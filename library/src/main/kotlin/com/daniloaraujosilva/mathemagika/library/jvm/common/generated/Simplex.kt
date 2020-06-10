package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Simplex
 * 
 * Full name:        System`Simplex
 * 
 *                   Simplex[{p , …, p }] represents the simplex spanned by points p .
 * Usage:                      1      k                                             i
 * 
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> {}
 *                   VertexColors -> Automatic
 *                   VertexNormals -> Automatic
 * Options:          VertexTextureCoordinates -> None
 * 
 * Attributes:       Protected
 * 
 *                   local: paclet:ref/Simplex
 * Documentation:    web: http://reference.wolfram.com/language/ref/Simplex.html
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
fun simplex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Simplex", arguments.toMutableList(), options)
}
