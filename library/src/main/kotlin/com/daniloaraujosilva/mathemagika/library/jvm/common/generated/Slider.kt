package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             Slider
 * 
 * Full name:        System`Slider
 * 
 *                   Slider[x] represents a slider with setting x in the range 0 to 1. 
 *                   Slider[Dynamic[x]] takes the setting to be the dynamically updated current value of x, with the value of x being reset if the slider is moved. 
 *                   Slider[x, {x   , x   }] represents a slider with range x    to x   . 
 *                               min   max                                   min     max
 *                   Slider[x, {x   , x   , dx}] represents a slider that jumps in steps dx. 
 *                               min   max
 *                   Slider[x, {{e , e , …}}] represents a slider in which equally spaced intervals correspond to successive settings e . 
 *                                1   2                                                                                                i
 *                   Slider[x, {{{e , w }, {e , w }, …}}] uses intervals of relative widths w  for the e . 
 * Usage:                          1   1     2   2                                           i          i
 * 
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> Slider
 *                   DefaultOptions -> {}
 *                   Enabled -> Automatic
 *                   Exclusions -> {}
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/Slider
 * Documentation:    web: http://reference.wolfram.com/language/ref/Slider.html
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
fun slider(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("Slider", arguments.toMutableList(), options)
}
