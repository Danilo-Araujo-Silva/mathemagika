package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             DynamicNamespace
 *
 * Full name:        System`DynamicNamespace
 *
 * Usage:            System`DynamicNamespace
 *
 *                   AutoDelete -> False
 *                   BaseStyle -> {}
 *                   DefaultBaseStyle -> {}
 *                   DefaultTooltipStyle -> TooltipLabel
 *                   DeleteWithContents -> True
 *                   DeletionWarning -> False
 *                   Editable -> Automatic
 *                   BoxForm`PrivateNames -> {}
 *                   BoxForm`PublicNames -> {}
 *                   Selectable -> Automatic
 *                   SelectWithContents -> False
 *                   StripWrapperBoxes -> False
 *                   SyntaxForm -> Automatic
 *                   Tooltip -> None
 *                   TooltipDelay -> 0.
 * Options:          TooltipStyle -> {}
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
fun dynamicNamespace(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("DynamicNamespace", arguments.toMutableList(), options)
}
