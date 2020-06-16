package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             Slider2D
 *
 * Full name:        System`Slider2D
 *
 *                   Slider2D[{x, y}] represents a 2D slider with settings x and y in the range 0 to 1.
 *                   Slider2D[Dynamic[pt]] takes the setting to be the dynamically updated current value of pt, with the value of pt being reset if the slider is moved.
 *                   Slider2D[pt, {min, max}] represents a 2D slider with range min to max in each direction.
 *                   Slider2D[pt, {min, max, d}] represents a 2D slider that jumps in steps d in each direction.
 *                   Slider2D[pt, {{x   , y   }, {x   , y   }}] specifies different ranges in x and y directions.
 *                                   min   min     max   max
 *                   Slider2D[pt, {{x   , y   }, {x   , y   }, {dx, dy}}] uses jumps dx, dy.
 * Usage:                            min   min     max   max
 *
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> Slider2D
 *                   Enabled -> Automatic
 *                   Exclusions -> {}
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Slider2D
 * Documentation:    web: http://reference.wolfram.com/language/ref/Slider2D.html
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
fun slider2D(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Slider2D", arguments.toMutableList(), options)
}
