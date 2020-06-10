package com.daniloaraujosilva.mathemagika.library.jvm.common.generated

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 * 
 * Name:             VerticalSlider
 * 
 * Full name:        System`VerticalSlider
 * 
 *                   VerticalSlider[y] represents a vertical slider at position y with range 0 to 1. 
 *                   VerticalSlider[Dynamic[y]] takes the position to be the dynamically updated current value of y, with the value of y being reset if the slider is moved. 
 *                   VerticalSlider[y, {y   , y   }] represents a vertical slider with range y    to y   . 
 *                                       min   max                                            min     max
 *                   VerticalSlider[y, {y   , y   , dy}] represents a vertical slider that jumps in steps dy. 
 *                                       min   max
 *                   VerticalSlider[y, {{e , e , …}}] represents a slider in which equally spaced intervals correspond to successive settings e . 
 *                                        1   2                                                                                                i
 *                   VerticalSlider[y, {{{e , h }, {e , h }, …}}] uses intervals of relative heights h  for the e . 
 * Usage:                                  1   1     2   2                                            i          i
 * 
 *                   Appearance -> Automatic
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   DefaultBaseStyle -> VerticalSlider
 *                   DefaultOptions -> {}
 *                   Enabled -> Automatic
 *                   Exclusions -> {}
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 * 
 *                   Protected
 * Attributes:       ReadProtected
 * 
 *                   local: paclet:ref/VerticalSlider
 * Documentation:    web: http://reference.wolfram.com/language/ref/VerticalSlider.html
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
fun verticalSlider(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VerticalSlider", arguments.toMutableList(), options)
}
