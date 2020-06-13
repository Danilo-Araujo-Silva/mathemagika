package com.daniloaraujosilva.mathemagika.library.jvm.functions

import com.daniloaraujosilva.mathemagika.library.jvm.MathematicaFunction

/**
 *````
 *
 * Name:             GraphicsGrid
 *
 * Full name:        System`GraphicsGrid
 *
 *                   GraphicsGrid[{{g  , g  , …}, …}] generates a graphic in which the g   are laid out in a two-dimensional grid.
 * Usage:                            11   12                                            ij
 *
 *                   Alignment -> Automatic
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> Automatic
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DefaultBaseStyle -> GraphicsGrid
 *                   DisplayFunction :> $DisplayFunction
 *                   Dividers -> None
 *                   Epilog -> {}
 *                   FormatType :> TraditionalForm
 *                   Frame -> None
 *                   FrameLabel -> None
 *                   FrameStyle -> Automatic
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   ItemAspectRatio -> Automatic
 *                   LabelStyle -> {}
 *                   Method -> Automatic
 *                   PlotLabel -> None
 *                   PlotRange -> All
 *                   PlotRangeClipping -> False
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RotateLabel -> True
 *                   Spacings -> Scaled[0.1]
 *                   Ticks -> Automatic
 * Options:          TicksStyle -> {}
 *
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/GraphicsGrid
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphicsGrid.html
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
fun graphicsGrid(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphicsGrid", arguments.toMutableList(), options)
}
