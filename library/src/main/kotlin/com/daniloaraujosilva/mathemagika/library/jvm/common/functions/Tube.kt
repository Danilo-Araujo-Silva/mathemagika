package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Tube
 *
 * Full name:        System`Tube
 *
 *                   Tube[{{x , y , z }, {x , y , z }, …}] represents a 3D tube around the line joining a sequence of points.
 *                           1   1   1     2   2   2
 *                   Tube[{pt , pt , …}, r] represents a tube of radius r.
 *                           1    2
 *                   Tube[{{pt  , pt  , …}, {pt  , …}, …}, …] represents a collection of tubes.
 *                            11    12         21
 * Usage:            Tube[curve, …] represents a tube around the specified 3D curve.
 *
 *                   Frame -> Automatic
 *                   Method -> {}
 * Options:          VertexColors -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Tube
 * Documentation:    web: http://reference.wolfram.com/language/ref/Tube.html
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
fun tube(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Tube", arguments.toMutableList(), options)
}
