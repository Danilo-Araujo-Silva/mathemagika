package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             MenuSortingValue
 *
 * Full name:        System`MenuSortingValue
 *
 * Usage:            MenuSortingValue is an option for cells and notebooks that specifies where a cell style, stylesheet, or palette is listed in the Format ▶ Style submenu, Format ▶ Stylesheet submenu, or Palettes menu respectively.
 *
 * Options:          None
 *
 * Attributes:       Protected
 *
 *                   local: paclet:ref/MenuSortingValue
 * Documentation:    web: http://reference.wolfram.com/language/ref/MenuSortingValue.html
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
fun menuSortingValue(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("MenuSortingValue", arguments.toMutableList(), options)
}
