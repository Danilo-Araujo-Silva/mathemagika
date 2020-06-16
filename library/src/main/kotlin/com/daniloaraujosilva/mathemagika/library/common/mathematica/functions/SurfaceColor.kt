package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             SurfaceColor
 *
 * Full name:        System`SurfaceColor
 *
 *                   SurfaceColor[dcol] is a three-dimensional graphics directive which specifies that the surfaces which follow should act as diffuse reflectors of light with a color given by dcol.
 *                   SurfaceColor[dcol, scol] specifies that a specular reflection component should be included, with a color given by scol.
 *                   SurfaceColor[dcol, {scol, n}] specifies that the reflection should occur with specular exponent n.
 * Usage:            SurfaceColor[dcol, scol, gcol] specifies that a color gcol should be added as if there were an intrinsic glow in the polygon.
 *
 * Options:          None
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/SurfaceColor
 * Documentation:    web: http://reference.wolfram.com/language/ref/SurfaceColor.html
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
fun surfaceColor(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("SurfaceColor", arguments.toMutableList(), options)
}
