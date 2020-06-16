package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             GraphicsColumn
 *
 * Full name:        System`GraphicsColumn
 *
 *                   GraphicsColumn[{g , g , …}] generates a graphic in which the g  are laid out in a column, with g  above g , etc.
 *                                    1   2                                        i                                 1        2
 *                   GraphicsColumn[list, alignment] aligns each element horizontally in the specified way.
 * Usage:            GraphicsColumn[list, alignment, spacing] leaves the specified spacing between successive elements.
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
 *                   local: paclet:ref/GraphicsColumn
 * Documentation:    web: http://reference.wolfram.com/language/ref/GraphicsColumn.html
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
fun graphicsColumn(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("GraphicsColumn", arguments.toMutableList(), options)
}
