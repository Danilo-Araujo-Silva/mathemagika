package com.daniloaraujosilva.mathemagika.library.jvm.common.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             IntervalSlider
 *
 * Full name:        System`IntervalSlider
 *
 *                   IntervalSlider[{xmin, xmax}] represents a slider with setting {xmin, xmax} in the range 0 to 1.
 *                   IntervalSlider[Dynamic[int]] takes the setting to be the dynamically updated current value of int, with the value of int being reset if the slider is moved.
 *                   IntervalSlider[int, {min, max}] represents a slider with range min to max.
 * Usage:            IntervalSlider[int, {min, max, dx}] represents a slider that jumps in steps dx.
 *
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContinuousAction -> True
 *                   Enabled -> Automatic
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> Automatic
 *                   ImageSize -> Medium
 *                   Method -> Automatic
 * Options:          MinIntervalSize -> 0
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/IntervalSlider
 * Documentation:    web: http://reference.wolfram.com/language/ref/IntervalSlider.html
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
fun intervalSlider(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("IntervalSlider", arguments.toMutableList(), options)
}
