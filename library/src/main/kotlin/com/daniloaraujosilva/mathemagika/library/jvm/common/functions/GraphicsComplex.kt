package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             GraphicsComplex
 *
 * Full name:        System`GraphicsComplex
 *
 *                   GraphicsComplex[{pt , pt , …}, data] represents a graphics complex in which coordinates given as integers i in graphics primitives in data are taken to be pt .
 * Usage:                               1    2                                                                                                                                    i
 *
 *                   ContentSelectable -> Automatic
 *                   VertexColors -> Automatic
 *                   VertexNormals -> Automatic
 * Options:          VertexTextureCoordinates -> None
 *
 *                   NHoldRest
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GraphicsComplex
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphicsComplex.html
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
fun graphicsComplex(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphicsComplex", arguments.toMutableList(), options)
}
