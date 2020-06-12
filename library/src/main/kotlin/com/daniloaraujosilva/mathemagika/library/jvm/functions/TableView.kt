package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.common.MathematicaFunction

/**
 *````
 *
 * Name:             TableView
 *
 * Full name:        System`TableView
 *
 *                   TableView[{{expr  , expr  , …}, {expr  , expr  , …}, …}] displays as a spreadsheet-like table view for editing and viewing expr  .
 *                                   11      12           21      22                                                                                ij
 *                   TableView[Dynamic[x]] takes the contents of the table view to be the dynamically updated current value of x, with the value of x being reset as the table view is interactively edited.
 *                   TableView[table, type] uses the specified type by default to represent newly edited or created entries in the table view.
 * Usage:            TableView[] displays an empty table view.
 *
 *                   Alignment -> {Automatic, Automatic}
 *                   AllowedDimensions -> Automatic
 *                   Appearance -> Automatic
 *                   AppearanceElements -> All
 *                   Background -> Automatic
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ContentPadding -> True
 *                   DefaultBaseStyle -> TableView
 *                   Enabled -> Automatic
 *                   FieldSize -> {{1., 5.}, {1., 1.}}
 *                   FrameMargins -> Automatic
 *                   ImageMargins -> Automatic
 *                   ImageSize -> Automatic
 *                   ItemSize -> {}
 *                   Scrollbars -> {Automatic, Automatic}
 *                   ScrollPosition -> {0., 0.}
 * Options:          Spacings -> Automatic
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/TableView
 * Documentation:    web: http://reference.wolfram.com/language/ref/TableView.html
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
fun tableView(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("TableView", arguments.toMutableList(), options)
}
