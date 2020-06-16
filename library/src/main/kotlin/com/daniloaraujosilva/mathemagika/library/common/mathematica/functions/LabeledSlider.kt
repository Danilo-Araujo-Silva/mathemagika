package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             LabeledSlider
 *
 * Full name:        System`LabeledSlider
 *
 * Usage:            System`LabeledSlider
 *
 *                   Appearance -> Frameless
 *                   AutoAction -> False
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   ContinuousAction -> True
 *                   ControlPlacement -> Automatic
 *                   DefaultBaseStyle -> LabeledSlider
 *                   DefaultLabelStyle -> LabeledSliderLabel
 *                   DefaultOptions -> {}
 *                   Enabled -> Automatic
 *                   Exclusions -> {}
 *                   FieldSize -> {{5, 10}, {1, 2}}
 *                   ImageMargins -> 0
 * Options:          ImageSize -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: <>None[Local]
 * Documentation:    web: <>None[Web]
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
fun labeledSlider(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("LabeledSlider", arguments.toMutableList(), options)
}
