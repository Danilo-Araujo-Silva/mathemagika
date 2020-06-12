package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             Manipulator
 *
 * Full name:        System`Manipulator
 *
 *                   Manipulator[x] represents a manipulator with setting x in the range 0 to 1.
 *                   Manipulator[Dynamic[x]] takes the setting to be the dynamically updated current value of x, with the value of x being reset if the manipulator is moved.
 *                   Manipulator[x, {x   , x   }] represents a manipulator with range x    to x   .
 *                                    min   max                                        min     max
 *                   Manipulator[x, {x   , x   , dx}] represents a manipulator that jumps in steps dx.
 * Usage:                             min   max
 *
 *                   AnimationDirection -> Forward
 *                   AnimationRate -> Automatic
 *                   AnimationRunning -> False
 *                   AnimationTimeIndex -> Automatic
 *                   Appearance -> Automatic
 *                   AppearanceElements -> Automatic
 *                   AutoAction -> False
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContinuousAction -> True
 *                   DefaultOptions -> {}
 *                   Enabled -> Automatic
 *                   Exclusions -> {}
 *                   ImageMargins -> 0
 *                   ImageSize -> Automatic
 *                   LabelStyle -> {}
 * Options:          PausedTime -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/Manipulator
 * Documentation:    web: http://reference.wolfram.com/language/ref/Manipulator.html
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
fun manipulator(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Manipulator", arguments.toMutableList(), options)
}
