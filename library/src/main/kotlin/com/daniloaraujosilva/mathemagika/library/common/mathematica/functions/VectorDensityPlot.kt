package com.daniloaraujosilva.mathemagika.library.common.mathematica.functions

import com.daniloaraujosilva.mathemagika.library.common.mathematica.MathematicaFunction

/**
 *````
 *
 * Name:             VectorDensityPlot
 *
 * Full name:        System`VectorDensityPlot
 *
 *                   VectorDensityPlot[{{v , v }, s}, {x, x   , x   }, {y, y   , y   }] generates a vector plot of the vector field {v , v } as a function of x and y, superimposed on a density plot of the scalar field s.
 *                                        x   y            min   max        min   max                                                 x   y
 *                   VectorDensityPlot[{v , v }, {x, x   , x   }, {y, y   , y   }] takes the scalar field to be the norm of the vector field.
 *                                       x   y        min   max        min   max
 *                   VectorDensityPlot[{{v , v }, {w , w }, …, s}, {x, x   , x   }, {y, y   , y   }] plots several vector fields.
 *                                        x   y     x   y               min   max        min   max
 * Usage:            VectorDensityPlot[…, {x, y} ∈ reg] takes the variables {x, y} to be in the geometric region reg.
 *
 *                   AlignmentPoint -> Center
 *                   AspectRatio -> 1
 *                   Axes -> False
 *                   AxesLabel -> None
 *                   AxesOrigin -> Automatic
 *                   AxesStyle -> {}
 *                   Background -> None
 *                   BaselinePosition -> Automatic
 *                   BaseStyle -> {}
 *                   BoundaryStyle -> None
 *                   BoxRatios -> Automatic
 *                   ClippingStyle -> Automatic
 *                   ColorFunction -> Automatic
 *                   ColorFunctionScaling -> True
 *                   ColorOutput -> Automatic
 *                   ContentSelectable -> Automatic
 *                   CoordinatesToolOptions -> Automatic
 *                   DisplayFunction :> $DisplayFunction
 *                   Epilog -> {}
 *                   Evaluated -> Automatic
 *                   EvaluationMonitor -> None
 *                   FormatType :> TraditionalForm
 *                   Frame -> True
 *                   FrameLabel -> None
 *                   FrameStyle -> {}
 *                   FrameTicks -> Automatic
 *                   FrameTicksStyle -> {}
 *                   GridLines -> None
 *                   GridLinesStyle -> {}
 *                   ImageMargins -> 0.
 *                   ImagePadding -> All
 *                   ImageSize -> Automatic
 *                   ImageSizeRaw -> Automatic
 *                   LabelStyle -> {}
 *                   LightingAngle -> None
 *                   MaxRecursion -> Automatic
 *                   Mesh -> None
 *                   MeshFunctions -> Automatic
 *                   MeshShading -> None
 *                   MeshStyle -> Automatic
 *                   Method -> Automatic
 *                   NormalsFunction -> Automatic
 *                   PerformanceGoal :> $PerformanceGoal
 *                   PlotLabel -> None
 *                   PlotLegends -> None
 *                   PlotRange -> {Full, Full}
 *                   PlotRangeClipping -> True
 *                   PlotRangePadding -> Automatic
 *                   PlotRegion -> Automatic
 *                   PlotTheme :> $PlotTheme
 *                   PreserveImageOptions -> Automatic
 *                   Prolog -> {}
 *                   RegionBoundaryStyle -> Automatic
 *                   RegionFillingStyle -> Automatic
 *                   RegionFunction -> (True & )
 *                   RotateLabel -> True
 *                   StreamColorFunction -> None
 *                   StreamColorFunctionScaling -> True
 *                   StreamMarkers -> Automatic
 *                   StreamPoints -> None
 *                   StreamScale -> Automatic
 *                   StreamStyle -> Automatic
 *                   TargetUnits -> Automatic
 *                   Ticks -> Automatic
 *                   TicksStyle -> {}
 *                   VectorAspectRatio -> Automatic
 *                   VectorColorFunction -> Automatic
 *                   VectorColorFunctionScaling -> True
 *                   VectorMarkers -> Automatic
 *                   VectorPoints -> Automatic
 *                   VectorRange -> Automatic
 *                   VectorScale -> None
 *                   VectorScaling -> None
 *                   VectorSizes -> Automatic
 *                   VectorStyle -> Automatic
 * Options:          WorkingPrecision -> MachinePrecision
 *
 *                   HoldAll
 *                   Protected
 * Attributes:       ReadProtected
 *
 *                   local: paclet:ref/VectorDensityPlot
 * Documentation:    web: http://reference.wolfram.com/language/ref/VectorDensityPlot.html
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
fun vectorDensityPlot(vararg arguments: Any?, options: MutableMap<String, Any?> = mutableMapOf()): MathematicaFunction {
	return MathematicaFunction("VectorDensityPlot", arguments.toMutableList(), options)
}
